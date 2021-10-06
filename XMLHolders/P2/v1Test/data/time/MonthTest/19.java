@Test
    public void testSerialization() {
        Month m1 = new Month(12, 1999);
        Month m2 = (Month) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    