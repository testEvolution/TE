@Test
    public void testEquals() {
        MyComparableObjectSeries s1 = new MyComparableObjectSeries("A");
        MyComparableObjectSeries s2 = new MyComparableObjectSeries("A");
        assertTrue(s1.equals(s2));
        assertTrue(s2.equals(s1));

        // key
        s1 = new MyComparableObjectSeries("B");
        assertNotEquals(s1, s2);
        s2 = new MyComparableObjectSeries("B");
        assertTrue(s1.equals(s2));

        // autoSort
        s1 = new MyComparableObjectSeries("B", false, true);
        assertNotEquals(s1, s2);
        s2 = new MyComparableObjectSeries("B", false, true);
        assertTrue(s1.equals(s2));

        // allowDuplicateXValues
        s1 = new MyComparableObjectSeries("B", false, false);
        assertNotEquals(s1, s2);
        s2 = new MyComparableObjectSeries("B", false, false);
        assertTrue(s1.equals(s2));

        // add a value
        s1.add(1, "ABC");
        assertNotEquals(s1, s2);
        s2.add(1, "ABC");
        assertTrue(s1.equals(s2));

        // add another value
        s1.add(0, "DEF");
        assertNotEquals(s1, s2);
        s2.add(0, "DEF");
        assertTrue(s1.equals(s2));

        // remove an item
        s1.remove(1);
        assertNotEquals(s1, s2);
        s2.remove(1);
        assertTrue(s1.equals(s2));
    }

    