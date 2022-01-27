package stream;

import org.checkerframework.common.value.qual.MatchesRegex;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import javax.annotation.MatchesPattern;
import java.io.IOException;
import java.util.LinkedList;
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
        List<String> temps = cars.stream()
                .map(car -> car.getModel())
                .collect(Collectors.toList());

        for (String info :temps
        ) {
            System.out.println(info);
        }
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
        List<String> temps = cars.stream()
                .filter(car -> car.getColor().equals("Blue"))
                .map(car -> car.getModel())
                .collect(Collectors.toList());
        for (String info :temps
             ) {
            System.out.println(info);
        }
    }

    @Test
    public void 가격이10만원이상만_구하시오() throws IOException{
        //십만원 넘는 차가 없어서 오만원으로 해봤습니당 !
        List<Car> cars = MockData.getCars();
//        cars.forEach(car -> {
//            if(car.getPrice() >= 50000) {
//                System.out.println(car);
//            }
//        });
        List<String> temps = cars.stream()
                .filter(car -> car.getPrice() >= 99000)
                .map(car -> car.toString())
                .collect(Collectors.toList());
        for (String info :temps
        ) {
            System.out.println(info);
        }
    }

    @Test
    public void 매이커가_토요타이고_출시년도가_2000년_이상인_자동차_모델명을_구하시오() throws IOException {
        List<Car> cars = MockData.getCars();
        cars.forEach(car -> {
            if(car.getMake().equals("Toyota") && car.getYear() > 2000) {
                System.out.println(car.getModel());
            }
        });
        List<String> temps = cars.stream()
                .filter(car -> car.getYear() > 2000)
                .filter(car -> car.getMake().equals("Toyota"))
                .map(car -> car.toString())
                .collect(Collectors.toList());
        temps.forEach(x-> System.out.println(x));
    }

    @Test
    public void 매이커가_현대이고_금액이10000_이상인_자동차를_구하시오() throws IOException {
        List<Car> cars = MockData.getCars();
        List<String> temps = cars.stream()
                .filter(car -> car.getPrice() > 10000)
                .filter(car -> car.getMake().equals("Hyundai"))
                .map(car -> car.toString())
                .collect(Collectors.toList());
        temps.forEach(x-> System.out.println(x));

    }
}
