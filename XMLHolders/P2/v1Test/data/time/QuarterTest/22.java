@Test
    public void testConstructor() {
        boolean pass = false;
        try {
            /*Quarter q =*/ new Quarter(0, 2005);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            /*Quarter q =*/ new Quarter(5, 2005);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    