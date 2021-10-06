@Test
    public void testSerialization() {
        DefaultWindDataset d1 = new DefaultWindDataset();
        DefaultWindDataset d2 = (DefaultWindDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);

        // try a dataset with some content...
        d1 = createSampleDataset1();
        d2 = (DefaultWindDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    