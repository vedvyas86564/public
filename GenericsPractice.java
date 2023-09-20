import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {
    public static void main(String[] args) {
        //Polymorphism is calling a child class with a parent class
        //if you do this, you will only have access to the methods of the parent class
        //and not the specific methods of the child class

        //dynamic binding occurs when you use polymorphism, it occurs because java
        //will not be able to differentiate the different child classes you used in the parent class until runtime
        //for example, if you initialized you HashMap with map, java won't know it is a TreeMap or HashMap

        // ClassCastException is when you try to cast a parent class into a child class
        //java won't allow this because a parent class can't have the properties of a child class(they are unique to the child class)
        List<Number> list = new ArrayList<>();
        list.add(11);
        list.add(11.2f);
        for (Number element : list) {
            //element.doubleValue();//this exhibits dynamic binding because java has to figure out
            //if the element is an Integer at runtime, if so, then java will be able to use .doubleValue()
            //otherwise, since Number class doesn't have .doubleValue() it won't be available
            //((Integer)element).valueOf()
            System.out.println(element);
            //instance of will return true if it is an element of the given type
            //however, using instance of requires reflection, which is a very slow process
            //instanceof should be used sparingly

            System.out.println(element instanceof Float);
            System.out.println(element instanceof Number);

            //marker interface is interface without any code

        }
    }
}
