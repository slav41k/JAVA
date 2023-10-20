public class Words implements Comparable<Words>
{
    private final String WORD;
    private final int  COUNT_OF_UPPERCASE_LETTERS;


    public Words(String word, int countOfUppercaseLetters)
    {
        this.WORD = word;
        this.COUNT_OF_UPPERCASE_LETTERS = countOfUppercaseLetters;
    }


    public static int CountChanges(String defaultWord, String lowercased)
    {
        int changes = 0;
        for (int i = 0; i < defaultWord.length(); i++)
        {
            char defaultChar = defaultWord.charAt(i);
            char lowercasedChar = lowercased.charAt(i);

            if (defaultChar != lowercasedChar)
            {
                changes++;
            }
        }

        return changes;
    }

    @Override
    public int compareTo(Words other) {
        return Integer.compare(this.COUNT_OF_UPPERCASE_LETTERS, other.COUNT_OF_UPPERCASE_LETTERS);
    }

    public String toString() {
        return "Word: " + WORD + ", Count of uppercase letters: " + COUNT_OF_UPPERCASE_LETTERS;
    }

}
