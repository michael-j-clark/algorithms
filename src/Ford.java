import java.util.ArrayList;
import java.util.List;

public class Ford {

    String makeKeyVals(List<String> list, String name) {

        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {

            String n = name + i;

            ret.append(n + "=" + list.get(i));

            if (i != list.size() - 1) {

                ret.append("&");
            }

        }

        return ret.toString();
    }


    void validateInputs(List<String> list, int listLimit) {

        if (null != list && list.size() > listLimit) {

            throw new RuntimeException("Too many inputs");
        }
    }


    String makeUrl(List<String> starts, List<String> dests) {

        StringBuilder ret = new StringBuilder();

        validateInputs(starts, startLimit);
        validateInputs(dests, destLimit);

        final String url = "https://matrix.route.api.here.com/routing/7.2/calculatematrix.json?";

        String s = makeKeyVals(starts, "start");

        String d = makeKeyVals(dests, "destination");

        ret.append(url);
        ret.append(s);
        ret.append("&");
        ret.append(d);


        return ret.toString();

    }

    static int startLimit = 3;
    static int destLimit = 3;


    public static void main(String args[]) {

        Ford ford = new Ford();

        List<String> starts = new ArrayList<String>() {{

            add("1.5139");//s1
            add("2.5214");//s2
            add("3.5139");
            add("4.5214");

        }};

        List<String> dests = new ArrayList<String>() {{

            add("5.5411");//d1
            add("6.5163");//d2
            add("7.5411");
            add("8.5154");
            add("9.54");
            add("10.5163");
        }};


        //String finalUrl = ford.makeUrl(starts, dests);

        List<String> sList = new ArrayList<String>();
        List<String> dList = new ArrayList<String>();


        for (int i = 0; i < starts.size(); i = i + startLimit) {

            sList.clear();

            for (int k = i; k < i + startLimit; k++) {

                if (k < starts.size())
                    sList.add(starts.get(k));
            }


            for (int j = 0; j < dests.size(); j = j + destLimit) {

                dList.clear();

                for (int k = j; k < j + destLimit; k++) {

                    if (k < dests.size())
                        dList.add(dests.get(k));
                }

                String finalUrl = ford.makeUrl(sList, dList);

                System.out.println("finalUrl: " + finalUrl);

            }

        }


        //System.out.println("Final Url: " + finalUrl);


    }
}
