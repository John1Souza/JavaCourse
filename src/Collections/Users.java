package Collections;

import java.util.Objects;

public class Users {
    String name;
    String email;

    Users(){

    }
    Users(String name){
        this.name = name;
    }
//    public boolean equals(Object object){
//
//        if(object instanceof Users){
//            Users another = (Users) object;
//
//            boolean sameName = another.name.equals(this.name);
//            boolean sameEmail = another.email.equals(this.email);
//
//            return sameName && sameEmail;
//        }else{
//            return false;
//        }
//
//    }
//    // Hashcode será aborado em outra aula!
//    public int hashCode(){
//        return 0;
//    }


    // Auto generated by Intellij
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users users)) return false;
        return Objects.equals(name, users.name) && Objects.equals(email, users.email);
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }
}
