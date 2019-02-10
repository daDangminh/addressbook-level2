package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command {

	public static final String COMMAND_WORD = "sort";

	public static final String MESSAGE_USAGE = COMMAND_WORD
			+ ": Sort address book by name.\n"
			+ "Example: " + COMMAND_WORD;

	public static final String MESSAGE_RESULT = "Sort command executed";

	@Override
	public CommandResult execute() {
		// addressbook.sortByName()
		return new CommandResult(MESSAGE_RESULT);
	}
}
