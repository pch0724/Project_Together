package customDAO;

public class DogInfo {

   static String dName;
   static String dAge;
   static String dGender;
   static String dChip;
   //static int dPhoto;
   
   
   public DogInfo(String dName, String dAge, String dGender, String dChip/*, int dPhoto*/) {
      this.dName = dName;
      this.dAge = dAge;
      this.dGender = dGender;
      this.dChip = dChip;
      //this.dPhoto = dPhoto;
   }


   public DogInfo() {
      // TODO Auto-generated constructor stub
   }


   public String getdName() {
      return dName;
   }


   public void setdName(String dName) {
      this.dName = dName;
   }


   public String getdAge() {
      return dAge;
   }


   public void setdAge(String dAge) {
      this.dAge = dAge;
   }


   public String getdGender() {
      return dGender;
   }


   public void setdGender(String dGender) {
      this.dGender = dGender;
   }


   public String getdChip() {
      return dChip;
   }


   public void setdChip(String dChip) {
      this.dChip = dChip;
   }

/*
 * 
   public int getdPhoto() {
      return dPhoto;
   }


   public void setdPhoto(int dPhoto) {
      this.dPhoto = dPhoto;
   }
   
 */
   
   
}