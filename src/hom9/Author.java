package hom9;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private String middleName;

    @Override
    public String toString() {
        return name + '\'' +
                surname + '\'' +
                middleName + '\'';
    }

    public Author(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname) && middleName.equals(author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName);

    }

    public String getMiddleName() {
        return middleName;
//    }
//    public String toString(){
//        return  this.name+" "+this.surname+" "+this.middleName;
    }
}