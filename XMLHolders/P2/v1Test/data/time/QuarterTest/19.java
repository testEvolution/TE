@Test
    public void testSerialization() {
        Quarter q1 = new Quarter(4, 1999);
        Quarter q2 = (Quarter) TestUtils.serialised(q1);
        assertEquals(q1, q2);
    }

    