@Test
    public void testConstructor() {
        // check null argument 1
        try {
            /* ComparableObjectItem item1 = */ new ComparableObjectItem(null,
                    "XYZ");
            fail("There should be an exception.");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    