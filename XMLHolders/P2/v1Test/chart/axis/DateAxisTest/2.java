@Test
    public void test1472942() {
        DateAxis a1 = new DateAxis("Test");
        DateAxis a2 = new DateAxis("Test");
        assertTrue(a1.equals(a2));

        // range
        a1.setRange(new Date(1L), new Date(2L));
        assertFalse(a1.equals(a2));
        a2.setRange(new Date(1L), new Date(2L));
        assertTrue(a1.equals(a2));
    }

    