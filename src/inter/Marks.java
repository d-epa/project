package inter;
    public interface Marks{

        String name="";
        default void printer(){
            System.out.println("This is printing from marks interface");
        }
        default String Stringprinter(){
            return "This is string printer";
        }
    }


