@Test
    public void testSerialization() {
        TimePeriodValues s1 = new TimePeriodValues("A test");
        s1.add(new Year(2000), 13.75);
        s1.add(new Year(2001), 11.90);
        s1.add(new Year(2002), null);
        s1.add(new Year(2005), 19.32);
        s1.add(new Year(2007), 16.89);
        TimePeriodValues s2 = (TimePeriodValues) TestUtils.serialised(s1);
        assertTrue(s1.equals(s2));
    }

    