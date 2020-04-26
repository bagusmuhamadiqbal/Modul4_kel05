
package modul5_kel05;

public class userService {
    
private String[][] data = new String[2][3];
    private String email, password, roles = "";
    private String[][] histories = new String[2][4];  
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"baguskelompok05@gmail.com", "12345", "supedAdmin"},
            {"akmalkelompok05@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"baguskelompok05@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "26-04-2020"},
            {"akmalkelompok05@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "26-04-2020"}
        };  
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                     
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            showhistories();
            
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
    private void showhistories(){
        for(int i = 0; i < histories.length; i++)
        {
        if (histories[i][0].equals(email))
        {
       
            System.out.println(histories[i][1]);
            System.out.println(histories[i][2]);
            System.out.println("Tanggal Pinjam : "+histories[i][3]);
        }
        }
    
    }
    
}
