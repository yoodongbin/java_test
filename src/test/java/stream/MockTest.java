package stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class MockTest {

    @Test
    @DisplayName("전체 목록 출력하기 이름만..")
    public void testMockData() throws IOException {
        List<Car> cars = MockData.getCars();

    }

    @Test
    @DisplayName("파란색 모델만 구해서 이름과 색상을 출력하세요.")
    public void testGetModel() throws IOException{

    }

    @Test
    public void 가격이10만원이상만_구하시오(){

    }

    @Test
    public void 매이커가_토요타이고_출시년도가_2000년_이상인_자동차를_구하시오(){

    }

    @Test
    public void 매이커가_현대이고_금액이10000_이상인_자동차를_구하시오(){

    }


}
