@Test
    public void testHashcode() {
        OHLCSeries s1 = new OHLCSeries("Test");
        s1.add(new Year(2009), 1.0, 3.0, 2.0, 1.4);
        OHLCSeries s2 = new OHLCSeries("Test");
        s2.add(new Year(2009), 1.0, 3.0, 2.0, 1.4);
        assertTrue(s1.equals(s2));
        int h1 = s1.hashCode();
        int h2 = s2.hashCode();
        assertEquals(h1, h2);
    }

    