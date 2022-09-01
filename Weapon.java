public class Weapon {
    // Weapon attributes
    String object;
    String name;
    int damage;
    double Weight;
    String Rarity;
    String Description;
    public int weight;
    public int Damage;
  
    // Weapon methods
    public void Killerweapon() {
      System.out.println("Weapon: " + name);
      System.out.println("Damage:" + damage);
      System.out.println("Weight: " + Weight);
      System.out.println("Rarity: " + Rarity);
      System.out.println("Description: " + Description);
    }
  }
