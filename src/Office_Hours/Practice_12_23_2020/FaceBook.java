package Office_Hours.Practice_12_23_2020;

public class FaceBook {

    public static void main(String[] args) {
        ProductOwner PO = new ProductOwner("Aysel", "A01", 'F', 180000, true);
        BusinessAnalyst BA = new BusinessAnalyst("Ayse", "A02", 'F', 150000, true);
        ScrumMaster SM = new ScrumMaster("Yalcin", "A03", 'M', 135000, true);

        Tester tester1 = new Tester("Sayyohat")

        ScrumTeam scrumTeam = new ScrumTeam(PO, SM, BA);

        System.out.println(scrumTeam);

    }
}
