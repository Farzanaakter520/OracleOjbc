public class Main {
    public static void main(String[] args) {
        //String[][] Book = {
        //        {"Mathematics", "Alice John", "mathematics", "1400", "2002-08-18"},
        //        {"Chemistry", "John Doe", "Reaction", "1800","2002-08-18"},
        //        {"Chemistry", "John Doe", "Reaction", "1800","2002-08-18"},
        //        {"Chemistry", "John Doe", "Reaction", "1800","2002-08-18"}
//
        //};

        //InsertStudentOracle oracle = new InsertStudentOracle();
        //oracle.insertDummyData(Book);

        //InsertStudentPostgres postgres = new InsertStudentPostgres();
        //postgres.insertDummyData(Book);

        //Book book = new Book();
        //book.insertDummyData(Book);

        //selectStudentOracle selectStudentOracle = new selectStudentOracle();
        //selectStudentOracle.selectAllStudents();
    //   String csvFilePath = "C:\\JAVA\\JAVA CLASS\\OracleOjbc\\src\\fruit.csv";
    //  String[][] fruit = {
    //          {"1" ,"apple" ,"A" ,"B" ,"100" ,"2020-01-01" ,"2020-01-02"},
    //          {"2" ,"orange" ,"A" ,"B" ,"200" ,"2020-01-02" ,"2020-01-03"},
    //          {"3" ,"banana","A" ,"B" ,"300" ,"2020-01-03" ,"2020-01-04"}
    //  };

    //   InsertFruitOracle insertFruitOracle = new InsertFruitOracle();
    //   insertFruitOracle.insertDummyData(fruit);


                String csvFilePath = "C:\\JAVA\\JAVA CLASS\\OracleOjbc\\src\\fruit.csv";

                InsertFruitOracle insertFruitOracle = new InsertFruitOracle();
                insertFruitOracle.insertDummyData(csvFilePath);
            }
        }
