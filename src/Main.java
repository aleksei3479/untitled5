
public class Main {
    public static void main(String[] args) {
        System.out.println("������ 1");
        int age = 17 ;
        if (age >= 18 ) {
            System.out.println("���� ������� ��������" + age + "�� ������ ��������������");
        } else {
            System.out.println("���� ������� ��������" + age + "�� �� ������ ��������������,����� ������� ���������");
        }
        System.out.println("������ 2");
        int temperatyra = 0;
        if (temperatyra > 4) {
            System.out.println("�� �����" + temperatyra + "����� ������ � �����");
        } else {
            System.out.println("�� �����" + temperatyra + "����� ������ ��� �����");
        }
        System.out.println("������ 3");
        int speedexceeded = 60;
        if (speedexceeded > 70) {
            System.out.println("�������� ����������� �����" + speedexceeded + "����� ��������");
        } else {
            System.out.println("�������� ���������" + speedexceeded + "�������� ��������� �����");
        }
        System.out.println("������ 4");
        int agePercon = 25;
        if (agePercon > 2 && agePercon > 6) {
            System.out.println("���� ������� �������� �����" + agePercon + "�� ��� ����� ������ � ������� ���");
        if (agePercon > 7 || agePercon > 17) {
            System.out.println("���� ������� �������� �����" + agePercon + "�� ��� ����� ������ � �����");
        if(agePercon > 18 && agePercon > 24) {
            System.out.println("���� ������� �������� �����" + agePercon + "�� ��� ����� � ������������");
        if (agePercon > 25) {
        } else {
            System.out.println("���� ������� �������� �����" + agePercon + "�� ��� ����� ������ �� ������");
        }
        System.out.println("������ 5");
        int infant = 17;
        if (infant > 5 == infant > 14) {
            System.out.println("���� ������� ������� ������" + infant + "�� �� �� ����� ������� �� �����������");
        } else {
            System.out.println("���� ������� ������� ������" + infant + "�� �� ����� ������� �� ����������� � ������������� ���������");
            System.out.println("���� ������� ������" + infant + "�� �� ����� ������� ��� ������������� ���������");
        }
        System.out.println("������ 6");
        int railwaycarriage = 102;
        if (railwaycarriage > 60) {
            System.out.println("����������� ������ ������" + railwaycarriage + "��� ��������� �������");
        } else {
            System.out.println("����������� ������ ������" + railwaycarriage + "������� ����");
        }
        System.out.println("������ 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one �������� ");
        } else {
            if (two > one) {
                System.out.println("two ��������");
                if (two < three) {
                    System.out.println("three ��������");
                }


            }
        }
                }
            }
        }
    }
}
