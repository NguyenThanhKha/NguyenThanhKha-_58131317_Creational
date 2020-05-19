/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author HP
 */
public class StringBuilder {
    String str="";

    public StringBuilder(MyStringBuilder my) {
        this.str = my.str;
    }
    
    public static class MyStringBuilder
    {
        String str="+";
        public MyStringBuilder() {
        }
        public MyStringBuilder addString(String addS)
        {
            this.str = this.str.concat(str);
            return this;
        }
//        public MyStringBuilder addFloat(float addf)
//        {
//              
//            this.str = this.str.concat(str);
//            return this;
//        }
//         public MyStringBuilder addBool(boolean b){
//        
//             this.str = this.str.concat(str);
//            return this;
//         }

        public StringBuilder myStringBuilder() {
          return new StringBuilder(this);
        
    }
    }
     
    @Override
    public String toString() {
        return "StringBuilder{" + "str=" + str + '}';
    }
      
}
