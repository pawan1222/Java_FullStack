package day11;

/*
Object class:
    It is a supermost class of all java classes.
    It is present inside java.lang package.

    Object class Methods:
        1. toString()
        2. hashCode()
        3. equals(Object obj)
        4. finalize()
        5. getClass()
        6. clone()
        7. wait()
        8. wait(long l)
        9. wait(long l,int i)
        10. notify()
        11. notifyAll()

        ToString()
            The return type of toString method is String.
            It is use to return address of an object in string formate.

            Q-> Why we need to override toString() method?
                To print data of an object rather than printing address of an object.

        hashCode()
            The return type of hashCode() method is int.
            It will return unique integer value for each object.

        equals()
            return type of equals method is boolean.
            it is use to compare adddress of tow object.

            Q-> why do we need to override the equals() method?
                To compare data of an object rather than compare address of an object.


*/

// class p7{
//     int id;
//     String name;

//     public p7(int id,String name){
//         this.id=id;
//         this.name=name;
//     }

//     @Override
//     public String toString(){
//         return "P7 [id="+ id+", name = "+name+"]";
//     }
// }

// public class Object_class_notes {
//     public static void main(String[] args) {
//         p7 ref=new p7(1, "pawan");
//         System.out.println(ref);
//         System.out.println(ref.toString());


//         System.out.println(ref.hashCode()); //return integer value
//         System.out.println(Integer.toHexString(ref.hashCode())); // change hascode string to hexa decimal string
//         System.out.println(ref);

//         System.out.println(ref.getClass()); //class P7
//         System.out.println(ref.getClass().getName()); //p7

//         System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode())); // address

//     }
// }



// equals():->
class p7{
    int id;
    String name;

    public p7(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj){
        p7 ref= (p7)obj;
        return this.id==ref.id && this.name == ref.name;
    }
}

public class Object_class_notes {
    public static void main(String[] args) {
        p7 ref1=new p7(1, "pawan");
        p7 ref2=new p7(1, "pawan");

        System.out.println("ref1: "+ref1);
        System.out.println("ref2: "+ref2);
        System.out.println(ref1.equals(ref2)); // true   because override the equals function otherwise give false because compare address only and here compare data
        
    }
}