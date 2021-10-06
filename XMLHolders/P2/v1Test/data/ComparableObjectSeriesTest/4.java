@Test
    public void testCloning() throws CloneNotSupportedException {
        MyComparableObjectSeries s1 = new MyComparableObjectSeries("A");
        s1.add(1, "ABC");
        MyComparableObjectSeries s2 = (MyComparableObjectSeries) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));
    }

    