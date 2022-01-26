package stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MockTest {
    @Test
    @DisplayName("전체 목록 출력하기 이름만..")
    public void testMockData() throws IOException {
        List<Car> cars = MockData.getCars();
//        cars.forEach(car -> {
//                System.out.println(car.getModel());
//        });

        System.out.println(cars.stream().collect(Collectors.toList()));

    }

    @Test
    @DisplayName("파란색 모델만 구해서 이름만 출력하세요.")
    public void testGetModel() throws IOException{
        List<Car> cars = MockData.getCars();
//        cars.forEach(car -> {
//            if(car.getColor().equals("Blue")) {
//                System.out.println(car.getModel());
//            }
//        });
        System.out.println(
                cars.stream().filter(car -> car.getColor().equals("Blue")).collect(Collectors.toList()));
    }

    @Test
    public void 가격이10만원이상만_구하시오() throws IOException{
        //십만원 넘는 차가 없어서 오만원으로 해봤습니당 !
        List<Car> cars = MockData.getCars();
        cars.forEach(car -> {
            if(car.getPrice() >= 50000) {
                System.out.println(car);
            }
        });
    }

    @Test
    public void 매이커가_토요타이고_출시년도가_2000년_이상인_자동차_모델명을_구하시오() throws IOException {
        List<Car> cars = MockData.getCars();
        cars.forEach(car -> {
            if(car.getMake().equals("Toyota") && car.getYear() > 2000) {
                System.out.println(car.getModel());
            }
        });
    }

    @Test
    public void 매이커가_현대이고_금액이10000_이상인_자동차를_구하시오() throws IOException {
        List<Car> cars = MockData.getCars();
        cars.forEach(car -> {
            if (car.getMake().equals("Hyundai") && car.getPrice() > 10000) {
                System.out.println(car);
            }
        });
    }

}
