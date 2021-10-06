@Test
    public void testRemove() {
        OHLCSeries s1 = new OHLCSeries("s1");
        s1.add(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        s1.add(new Year(2011), 2.1, 4.1, 1.1, 3.1);
        s1.add(new Year(2010), 2.2, 4.2, 1.2, 3.2);
        assertEquals(3, s1.getItemCount());

        s1.remove(new Year(2010));
        assertEquals(new Year(2011), s1.getPeriod(1));

        s1.remove(new Year(2006));
        assertEquals(new Year(2011), s1.getPeriod(0));
    }

    