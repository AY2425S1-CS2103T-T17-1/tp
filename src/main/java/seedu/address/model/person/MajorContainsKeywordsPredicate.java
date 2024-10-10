package seedu.address.model.person;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;
import seedu.address.commons.util.ToStringBuilder;

/**
 * Tests that a {@code Person}'s {@code Major} matches any of the keywords given.
 */
public class MajorContainsKeywordsPredicate implements Predicate<Person> {
    private final String keyword;

    public MajorContainsKeywordsPredicate(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean test(Person person) {
        return person.getMajor().value.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof MajorContainsKeywordsPredicate)) {
            return false;
        }

        MajorContainsKeywordsPredicate otherPredicate = (MajorContainsKeywordsPredicate) other;
        return keyword.equalsIgnoreCase(otherPredicate.keyword);
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }
}
