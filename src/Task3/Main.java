package Task3;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();

        //String field = book.getField1();

        FieldReturning fr1 = new FieldReturning() {
            @Override
            public boolean valueOfField(String field) {
                return field == "field1" | field == "field2" | field == "field3" ;
            }

        };
        System.out.println("Anonims");
        System.out.println(fr1.valueOfField(book.getField1()));
        System.out.println(fr1.valueOfField(book.getField2()));
        System.out.println(fr1.valueOfField(book.getField3()));

        System.out.println();


        FieldReturning fr2 = field -> field=="field1"| field=="field2"|field=="field3";
        System.out.println("lambdas");
        System.out.println(fr2.valueOfField(book.getField1()));
        System.out.println(fr2.valueOfField(book.getField2()));
        System.out.println(fr2.valueOfField(book.getField3()));
    }



}
