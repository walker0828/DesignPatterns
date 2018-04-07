public class InitialContext{
    public Object lookup(String jndiName){
        if(jndiName.equalsIngoreCase("Service1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if(jndiName.equalsIngoreCase("Service2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }

}