public class Studentity{

    private int id;
    private String name;
    private String email;
    private float cgpa;

    public Studentity(int id, String name, String email, float cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public Studentity(){

    }

    public int getId(){
        this.id = id;
    }
    public void setId(){
        return id;
    }

    public int getName(){
        this.name = name;
    }
    public void setName(){
        return name;
    }

    public int getEmail(){
        this.email = email;
    }
    public void setEmail(){
        return email;
    }

    public int getCgpa(){
        this.cgpa = cgpa;
    }
    public void setCgpa(){
        return cgpa;
    }
}