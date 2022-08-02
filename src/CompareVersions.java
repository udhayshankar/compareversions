public class CompareVersions {
    public CompareVersions() {
    }

    public static void main(String[] args) {
        String versionOne = "1.3.9.9.9";
        String versionTwo = "1.3";
        System.out.println(compareVersion(versionOne, versionTwo));
    }

    public static int compareVersion(String versionOne, String versionTwo) {
        int versionNum1 = 0;
        int versionNum2 = 0;
        int i = 0;

        for(int j = 0; i < versionOne.length() || j < versionTwo.length(); ++j) {
            while(i < versionOne.length() && versionOne.charAt(i) != '.') {
                versionNum1 = versionNum1 * 10 + (versionOne.charAt(i) - 48);
                ++i;
            }

            while(j < versionTwo.length() && versionTwo.charAt(j) != '.') {
                versionNum2 = versionNum2 * 10 + (versionTwo.charAt(j) - 48);
                ++j;
            }

            if (versionNum1 > versionNum2) {
                return 1;
            }

            if (versionNum2 > versionNum1) {
                return -1;
            }

            versionNum2 = 0;
            versionNum1 = 0;
            ++i;
        }

        return 0;
    }
}


