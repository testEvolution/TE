@Test
    public void testBug134() {
        boolean pass = false;
        try {
            Week w = new Week(0, 2020);
        } catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            Week w = new Week(54, 2020);
        } catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

}