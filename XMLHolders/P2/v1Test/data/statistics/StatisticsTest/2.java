@Test
    public void testCalculateMedian() {

        // check null list
        assertTrue(Double.isNaN(Statistics.calculateMedian(null, false)));
        assertTrue(Double.isNaN(Statistics.calculateMedian(null, true)));

        // check empty list
        List<Double> list = new ArrayList<>();
        assertTrue(Double.isNaN(Statistics.calculateMedian(list, false)));
        assertTrue(Double.isNaN(Statistics.calculateMedian(list, true)));

        // check list containing null
        list.add(null);
        boolean pass = false;
        try {
            Statistics.calculateMedian(list, false);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            Statistics.calculateMedian(list, true);
        }
        catch (NullPointerException e) {
            pass = true;
        }
        assertTrue(pass);

        // check a list containing a non-Number object
        List<String> badList = new ArrayList<>();
        badList.add("Not a number");
        pass = false;
        try {
            Statistics.calculateMedian(badList, false);
        }
        catch (ClassCastException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            Statistics.calculateMedian(badList, true);
        } 
        catch (ClassCastException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    