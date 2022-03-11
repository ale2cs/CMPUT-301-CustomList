import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

        private CustomList list;

        @BeforeEach
        public void createList(){
            list = new CustomList(null, new ArrayList<City>());
        }

        @Test
        public void addCityTest(){
            int listSize = list.getCount();
            list.addCity(new City("Halifax", "NS"));
            assertEquals(listSize+1, list.getCount());

        }

        @Test
        public void deleteCityTest(){
            int listSize = list.getCount();

            City city = new City("Halifax", "NS");
            list.addCity(city);
            assertEquals(listSize+1, list.getCount());

            list.deleteCity(city);
            assertEquals(listSize, list.getCount());
        }

}
