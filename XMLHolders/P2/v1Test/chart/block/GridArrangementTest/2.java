@Test
    public void testSerialization() {
        GridArrangement f1 = new GridArrangement(33, 44);
        GridArrangement f2 = (GridArrangement) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

    