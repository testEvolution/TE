@Test
    public void test1802195() {
        ValueMarker m1 = new ValueMarker(25.0);
        ValueMarker m2 = (ValueMarker) TestUtils.serialised(m1);
        assertEquals(m1, m2);
        try {
            m2.setValue(-10.0);
        }
        catch (NullPointerException e) {
            fail("No exception should be thrown.");
        }
    }

    