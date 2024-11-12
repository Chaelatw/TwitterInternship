import java.util.HashSet;

public class SocialHandle  {

    HashSet<String> listOfHandles = new HashSet<>();


    public String createHandle(String yourSocialHandle) {
            if(yourSocialHandle.length() > 9){
                yourSocialHandle = yourSocialHandle.substring(0,9);
            }
        yourSocialHandle = "@" + yourSocialHandle.toLowerCase();

        return yourSocialHandle;
    }


    public void addHandle(String yourSocialHandle){
        listOfHandles.add(yourSocialHandle);

    }
    public int getSizeOfHandles(){
        return listOfHandles.size();
    }


    public void removeHandle(String yourSocialHandle){
        listOfHandles.remove(yourSocialHandle);
    }



    public HashSet<String> getHandles() {
        return listOfHandles;
    }

}