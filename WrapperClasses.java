public class WrapperClasses {
    public static void main(String[] args){
        //wrapper classes are a way to use primitive data types as reference data types
        //Primitive Data Types:
        // Primitive data types are simple, immutable data types that directly store the actual value. They are typically small and have a fixed size in memory. In JavaScript, there are several primitive data types:

        // Number: Represents numeric values (e.g., integers or floating-point numbers).
        // String: Represents sequences of characters (e.g., text).
        // Boolean: Represents true or false values.
        // Undefined: Represents a variable that has been declared but not assigned a value.
        // Null: Represents the intentional absence of any object or value.
        // Symbol: Represents unique and immutable values, often used as object property keys (ES6 and later).
        // Primitive data types are compared by their actual value. When you assign a primitive value to a variable or pass it as an argument to a function, you're working with a copy of that value, not a reference to it.

        // Reference Data Types:
        // Reference data types are more complex data types that store references (memory addresses) to the actual data, which is stored elsewhere in memory. In JavaScript, reference data types include:

        // Object: Represents collections of key-value pairs (e.g., { name: 'John', age: 30 }).
        // Array: A specialized type of object used to store ordered collections of data (e.g., [1, 2, 3]).
        // Function: Represents a callable code block.
        // Date: Represents date and time values.
        // RegExp: Represents regular expressions for pattern matching.
        // Strings are reference data types
        // reference data types are slower than primitive data types
        // wrapper classes my contain some usefull methods

        //primitive         //wrapper
        //boolean           //Boolean
        //char              //Character
        //int               //Integer
        //double            //Double   

        // Autoboxing:

        // Autoboxing is the automatic conversion of a primitive data type into its corresponding wrapper class object. It allows you to use primitive data types as if they were objects. This feature was introduced in Java 5.

        // For example, when you assign a primitive value to a wrapper class object, autoboxing takes care of converting the primitive value into an object:

        // java
        // Copy code
        // // Autoboxing: converting int to Integer
        // int primitiveInt = 42;
        // Integer wrapperInt = primitiveInt; // Autoboxing
        // Here, primitiveInt is automatically converted into an Integer object.

        // Unboxing:

        // Unboxing is the opposite of autoboxing. It is the automatic conversion of a wrapper class object back to its corresponding primitive data type. Unboxing allows you to extract the primitive value from a wrapper class object when you need to perform primitive operations.

        // For example, when you use a wrapper class object in a context that requires a primitive value, unboxing takes care of extracting the value:

      
        // // Unboxing: converting Integer to int
        // Integer wrapperInt = 42;
        // int primitiveInt = wrapperInt; // Unboxing
        // Here, the wrapperInt object is automatically unboxed to obtain the primitive int value.

        // Autoboxing and unboxing simplify the code by reducing the need for explicit conversions between primitive types and their corresponding wrapper classes, making it more convenient for developers to work with both primitive and object-oriented code. However, it's important to be aware of potential performance implications when working with autoboxing and unboxing in performance-critical code sections, as they can introduce some overhead compared to direct use of primitive types.

        Boolean a =true;
        Character b = '@';
        Integer x = 123;
        Double d = 3.14;
        String str = "Omar";

        
    }
}
