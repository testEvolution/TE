@Test
    public void testSetMaximumItemCount() {
        OHLCSeries s1 = new OHLCSeries("s1");
        assertEquals(Integer.MAX_VALUE, s1.getMaximumItemCount());
        s1.setMaximumItemCount(2);
        assertEquals(2, s1.getMaximumItemCount());
        s1.add(new Year(2006), 1.0, 1.1, 1.1, 1.1);
        s1.add(new Year(2007), 2.0, 2.2, 2.2, 2.2);
        s1.add(new Year(2008), 3.0, 3.3, 3.3, 3.3);
        assertEquals(new Year(2007), s1.getPeriod(0));
        assertEquals(new Year(2008), s1.getPeriod(1));
    }

    