public class User {
    private String name;
    private String surname;
    private String number;
    private String login;
    private String password;

    public User(String name, String surname, String number, String login, String password){
        this.name=name;
        this.surname=surname;
        this.number=number;
        this.login=login;
        this.password=password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number=number;
    }

    public  String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login=login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

}