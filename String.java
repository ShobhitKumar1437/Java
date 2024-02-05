public class String {
    public static void main(String[] args){
        String name="Shobhit Kumar";
         System.out.println(name.length());
         System.out.println(name.toLowerCase());
         System.out.println(name.toUpperCase());
         System.out.println(name.trim());
         System.out.println(name.substring (3));
          System.out.println(name.substring(3,5));


         String name1="Vikas Singh";
         System.out.println(name1.replace('d','b'));

         String name2="Abhinav Kumar";
          System.out.println(name2.startsWith("bh"));
          System.out.println(name2.endsWith("ar"));
          System.out.println(name2.charAt(2));
          System.out.println(name2.indexOf("S"));
          System.out.println(name2.indexOf("k" , 3));
          System.out.println(name2.lastIndexOf("i"));
          System.out.println(name2.lastIndexOf("k", 2));
          System.out.println(name2.equals("Abhinav Kumar"));
          System.out.println(name2.equalsIgnoreCase("Abhinav Kumar"));
    }
}
