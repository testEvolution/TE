@Test
    public void testGetStdDev() {

        // try null argument
        boolean pass = false;
        try {
            Statistics.getStdDev(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // try zero length array
        pass = false;
        try {
            Statistics.getStdDev(new Double[0]);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // try single value
        assertTrue(Double.isNaN(Statistics.getStdDev(new Double[]{1.0})));
    }

}