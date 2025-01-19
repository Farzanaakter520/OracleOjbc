public class Main {
    public static void main(String[] args) {
       String[][] Book = {
               {"Mathematics", "Alice John", "mathematics", "1400", "2002-08-18"},
               {"Chemistry", "John Doe", "Reaction", "1800","2002-08-18"},
               {"Chemistry", "John Doe", "Reaction", "1800","2002-08-18"},

       };

       //InsertStudentOracle oracle = new InsertStudentOracle();
       //oracle.insertDummyData(Book);

        //InsertStudentPostgres postgres = new InsertStudentPostgres();
        //postgres.insertDummyData(Book);

        Book book = new Book();
        book.insertDummyData(Book);
    }
}