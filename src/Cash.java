public class Cash {
    // Instance variables.
    int money;
    int month;

    /**
     * A class method that returns what you save each year.
     * @param c i a instance of the class Cash
     * @return Saving after one yar.
     */
    public static int savePerYear (Cash c){

        return c.money * 12;
    }
    /**
     * A class method that returns your total saving.
     * @param c i a instance of the class Cash
     * @return the total amount
     */
    public static int totalSave (Cash c){

      return c.money * c.month;
    }
    /**
     * A class method that returns how long you need to save to get one million.
     * @param c i a instance of the class Cash
     * @return months to on million
     */
    public static int million (Cash c){



        return 1000_000/ c.money;
        }


    }

