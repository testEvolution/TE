@Test
    public void testCloning() throws CloneNotSupportedException {
        OHLCSeries s1 = new OHLCSeries("s1");
        s1.add(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        OHLCSeries s2 = (OHLCSeries) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));
    }

    