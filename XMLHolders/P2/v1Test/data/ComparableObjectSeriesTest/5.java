@Test
    public void testSerialization() {
        MyComparableObjectSeries s1 = new MyComparableObjectSeries("A");
        s1.add(1, "ABC");
        MyComparableObjectSeries s2 = (MyComparableObjectSeries) 
                TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    