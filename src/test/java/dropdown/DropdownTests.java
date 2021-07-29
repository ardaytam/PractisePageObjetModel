package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        DropdownPage dropDownPage =  homePage.clickDropDown(); //a var a Dropdownpage típus helyett áll ill. bármilyen nmár megalkotott típus helyett(?)
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        Assertions.assertEquals(1, selectedOptions.size(), "Incorrect number of selections");
        Assertions.assertTrue(selectedOptions.contains(option), "Option not selected");


    }

}
