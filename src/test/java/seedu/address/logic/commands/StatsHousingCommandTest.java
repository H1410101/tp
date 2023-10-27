package seedu.address.logic.commands;

import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

public class StatsHousingCommandTest {

    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    private StatsHousingCommand housingCommand = new StatsHousingCommand();

}
