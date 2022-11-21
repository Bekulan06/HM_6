public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        boss.weapon.setName("avm");
        boss.weapon.setType(WeaponType.EMKA);
        System.out.println(boss.getHealth()+ " " + boss.getDamage()+ " "+ boss.weapon.getName() + " " +
                boss.weapon.getType());
    }
}