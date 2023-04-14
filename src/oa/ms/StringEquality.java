package oa.ms;

public class StringEquality {

    public static void main(String[] args) {

        String str1[] = {"pqqrr"};
        String str2[] = {"prrrr"};

        int l = str1.length, c=0;

        String result[] = new String[l];

        for(int i=0;i<l;i++)
        {
            if(str1[i].length()!=str2[i].length())
            {
                result[c++] = "NO";
                continue;
            }


            char val1 =' ', val2 = ' ';
            for(int j=0;j<str1[i].length();j++)
            {
                if(str1[i].charAt(j)!=str2[i].charAt(j))
                {
                    val1 = str1[i].charAt(j);
                    val2 = str2[i].charAt(j);
                    break;

                }
            }

            String str=" ";
            for(int k=0;k<str1[i].length();k++)
            {
                if(str1[i].charAt(k)!=str2[i].charAt(k) && str1[i].charAt(k)==val1 && str2[i].charAt(k) == val2)
                {

                    char ch = str1[i].charAt(k);

                    str = str2[i].substring(0, k) + ch
                            + str2[i].substring(k + 1);
                    str2[i] = str;
                }
            }

            if(str1[i].equals(str2[i]))
                result[c++] = "YES";
            else
                result[c++] = "NO";
        }

        for(int i=0;i<l;i++)
        {
            System.out.println(result[i] + " " + str1[i] + " " + str2[i]);
        }

    }
}
