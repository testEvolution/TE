@Test
    public void testEquals() {
        LogFormat f1 = new LogFormat(10.0, "10", true);
        LogFormat f2 = new LogFormat(10.0, "10", true);
        assertEquals(f1, f2);

        f1 = new LogFormat(11.0, "10", true);
        assertFalse(f1.equals(f2));
        f2 = new LogFormat(11.0, "10", true);
        assertTrue(f1.equals(f2));

        f1 = new LogFormat(11.0, "11", true);
        assertFalse(f1.equals(f2));
        f2 = new LogFormat(11.0, "11", true);
        assertTrue(f1.equals(f2));

        f1 = new LogFormat(11.0, "11", false);
        assertFalse(f1.equals(f2));
        f2 = new LogFormat(11.0, "11", false);
        assertTrue(f1.equals(f2));

        f1.setExponentFormat(new DecimalFormat("0.000"));
        assertFalse(f1.equals(f2));
        f2.setExponentFormat(new DecimalFormat("0.000"));
        assertTrue(f1.equals(f2));
    }

    