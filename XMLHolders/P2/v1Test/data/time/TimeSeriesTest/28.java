@Test
    public void testRemoveAgedItems3() {
        TimeSeries s = new TimeSeries("Test");
        boolean pass = true;
        try {
            s.removeAgedItems(0L, true);
        }
        catch (Exception e) {
            pass = false;
        }
        assertTrue(pass);
    }

    